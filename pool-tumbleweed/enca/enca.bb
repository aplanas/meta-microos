SUMMARY = "Detects encoding of text files"
DESCRIPTION = "Enca is an Extremely Naive Charset Analyser. It detects character set and \
encoding of text files and can also convert them to other encodings using \
either a built-in converter or external libraries and tools like libiconv, \
librecode, or cstocs. \
 \
Currently, it has support for Belarussian, Bulgarian, Croatian, Czech, \
Estonian, Latvian, Lithuanian, Polish, Russian, Slovak, Slovene, Ukrainian, \
Chinese, and some multibyte encodings (mostly variants of Unicode) \
independent on the language. \
 \
This package also contains shared Enca library other programs can make use of. \
 \
Install Enca if you need to cope with text files of dubious origin \
and unknown encoding and convert them to some reasonable encoding."
LICENSE = "GPL-2.0-only"

PV = "1.19"

RPM_NAME = "enca-1.19-2.4.aarch64.rpm"
RPM_HASH = "f0ca1ab455cc499661c0c4385c6dc5c5be99fba3818e05b4d4f95baeeab7ef1fb40aec24df3e80ba6d10d13b900cf4d651d7934751366c9e8d45fe175e89e414"

RPROVIDES:${PN} += "enca \
enca(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libenca.so.0()(64bit) \
sed"

inherit rpm
