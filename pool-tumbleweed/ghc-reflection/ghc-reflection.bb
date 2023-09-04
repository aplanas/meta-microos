SUMMARY = "Reifies arbitrary terms into types that can be reflected back into terms"
DESCRIPTION = "This package addresses the /configuration problem/ which is propagating \
configurations that are available at run-time, allowing multiple configurations \
to coexist without resorting to mutable global variables or \
'System.IO.Unsafe.unsafePerformIO'. \
 \
That package is an implementation of the ideas presented in the paper \
'Functional Pearl: Implicit Configurations' by Oleg Kiselyov and Chung-chieh \
Shan (<http://okmij.org/ftp/Haskell/tr-15-04.pdf original paper>). \
However, the API has been streamlined to improve performance. \
 \
There are a handful of tutorials on how to use this library: \
 \
* Austin Seipp's tutorial \
<https://www.schoolofhaskell.com/user/thoughtpolice/using-reflection Reflecting \
values to types and back> provides a summary of the approach taken by this \
library, along with more motivating examples. \
 \
* Arnaud Spiwack's tutorial \
<https://www.tweag.io/posts/2017-12-21-reflection-tutorial.html All about \
reflection> explains how to use this library."
LICENSE = "BSD-3-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-reflection-2.1.7-1.3.aarch64.rpm"
RPM_HASH = "2697721601e1c51a8b08f12d399614450e5c3d1980cad0f362590106632525b033db62b687bbd521ea808124c1e671b2be272ba3ab001bfbdb48e55420b375a0"

RPROVIDES:${PN} += "ghc-reflection \
libHSreflection-2.1.7-1WygFxHmxkcEQBv8T6gHut-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
