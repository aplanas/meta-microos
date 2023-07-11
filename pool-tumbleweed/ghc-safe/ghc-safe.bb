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

RPM_NAME = "ghc-safe-0.3.19-4.6.aarch64.rpm"
RPM_HASH = "501765536978b20f8e47b70e671fe0aad0dd27521a590fa85c3cc0da96812e616fb27ee8dc99feb9a42fdb09c4801bf00c0c8b18704e75e4154ede651a412c26"

RPROVIDES:${PN} += "ghc-safe \
libHSsafe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
