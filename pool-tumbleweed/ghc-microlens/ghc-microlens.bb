SUMMARY = "A tiny lens library with no dependencies"
DESCRIPTION = "NOTE: If you're writing an app, you probably want \
<http://hackage.haskell.org/package/microlens-platform microlens-platform> – it \
has the most features. <http://hackage.haskell.org/package/microlens microlens> \
is intended more for library writers who want a tiny lens library (after all, \
lenses are pretty useful for everything, not just for updating records!). \
 \
This library is an extract from <http://hackage.haskell.org/package/lens lens> \
(with no dependencies). It's not a toy lenses library, unsuitable for “real \
world”, but merely a small one. It is compatible with lens, and should have \
same performance. It also has better documentation. \
 \
There's a longer readme <https://github.com/monadfix/microlens#readme on \
Github>. It has a migration guide for lens users, a description of other \
packages in the family, a discussion of other lens libraries you could use \
instead, and so on. \
 \
Here are some usecases for this library: \
 \
* You want to define lenses or traversals in your own library, but don't want \
to depend on lens. Having lenses available often make working with a library \
more pleasant. \
 \
* You just want to be able to use lenses to transform data (or even just use \
'over _1' to change the first element of a tuple). \
 \
* You are new to lenses and want a small library to play with. \
 \
However, don't use this library if: \
 \
* You need 'Iso's, 'Prism's, indexed traversals, or actually anything else \
which isn't defined here (though some indexed functions are available elsewhere \
– containers and vector provide them for their types, and \
<http://hackage.haskell.org/package/ilist ilist> provides indexed functions for \
lists). \
 \
* You want a library with a clean, understandable implementation (in which case \
you're looking for <http://hackage.haskell.org/package/lens-simple \
lens-simple>). \
 \
As already mentioned, if you're writing an application which uses lenses more \
extensively, look at <http://hackage.haskell.org/package/microlens-platform \
microlens-platform> – it combines features of most other microlens packages \
(<http://hackage.haskell.org/package/microlens-mtl microlens-mtl>, \
<http://hackage.haskell.org/package/microlens-th microlens-th>, \
<http://hackage.haskell.org/package/microlens-ghc microlens-ghc>). \
 \
If you want to export getters or folds and don't mind the \
<http://hackage.haskell.org/package/contravariant contravariant> dependency, \
please consider using <http://hackage.haskell.org/package/microlens-contra \
microlens-contra>. \
 \
If you haven't ever used lenses before, read \
<http://hackage.haskell.org/package/lens-tutorial/docs/Control-Lens-Tutorial.html \
this tutorial>. (It's for lens, but it applies to microlens just as well.) \
 \
Note that microlens has no dependencies starting from GHC 7.10 (base-4.8). \
Prior to that, it depends on transformers-0.2 or above."
LICENSE = "BSD-3-Clause"

PV = "0.4.13.1"

RPM_NAME = "ghc-microlens-0.4.13.1-2.3.aarch64.rpm"
RPM_HASH = "c9e95523f22bb47781f932fe9dbbbe832f36a9e5d8770de6f0e4785513a27693b094e79bb9d844853e5e84d28f3407c76a3eeae1d20db6445f7ce1590e2bc6b9"

RPROVIDES:${PN} += "ghc-microlens \
libHSmicrolens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
