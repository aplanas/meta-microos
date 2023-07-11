SUMMARY = "Mach-O header analysis and editing"
DESCRIPTION = "macholib can be used to analyze and edit Mach-O headers, the executable \
format used by Mac OS X. \
 \
It's typically used as a dependency analysis tool, and also to rewrite dylib \
references in Mach-O headers to be @executable_path relative. \
 \
Though this tool targets a platform specific file format, it is pure python \
code that is platform and endian independent."
LICENSE = "MIT"

PV = "1.16.2"

RPM_NAME = "python310-macholib-1.16.2-2.3.noarch.rpm"
RPM_HASH = "876f75fec7680b8809f56d1c88da3a6be1eaea8fcdbccff6dc5a89e6e51faf582aa8040a311a6df2a4d0e44e39fc78f9a9570c716adebebdee91753cab935c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-macholib \
python310-macholib \
python3dist-macholib"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-altgraph \
python310-setuptools \
update-alternatives"

inherit rpm
