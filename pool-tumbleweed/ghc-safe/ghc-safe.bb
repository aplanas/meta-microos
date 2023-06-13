SUMMARY = "Library of safe (exception free) functions"
DESCRIPTION = "A library wrapping 'Prelude'/'Data.List' functions that can throw exceptions, \
such as 'head' and '!!'. Each unsafe function has up to four variants, e.g. \
with 'tail': \
 \
* 'tail :: [a] -> [a]', raises an error on 'tail []'. \
 \
* 'tailMay :: [a] -> /Maybe/ [a]', turns errors into 'Nothing'. \
 \
* 'tailDef :: /[a]/ -> [a] -> [a]', takes a default to return on errors. \
 \
* 'tailNote :: /String/ -> [a] -> [a]', takes an extra argument which \
supplements the error message. \
 \
* 'tailSafe :: [a] -> [a]', returns some sensible default if possible, '[]' in \
the case of 'tail'. \
 \
This package is divided into three modules: \
 \
* 'Safe' contains safe variants of 'Prelude' and 'Data.List' functions. \
 \
* 'Safe.Foldable' contains safe variants of 'Foldable' functions. \
 \
* 'Safe.Exact' creates crashing versions of functions like 'zip' (errors if the \
lists are not equal) and 'take' (errors if there are not enough elements), then \
wraps them to provide safe variants."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-0.3.19-4.3.aarch64.rpm"
RPM_HASH = "a43cd6394eac407b5f5c8d53f880c93269514f4f58e3391f32c0eee6e5126f2f8217a8c5afdb02ad0be8afc7b79f93b652f43fedba2f86b6010d6aa0ce0607dc"

RPROVIDES:${PN} += "ghc-safe \
ghc-safe(aarch-64) \
libHSsafe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
