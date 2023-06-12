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

RPM_NAME = "python310-macholib-1.16.2-1.4.noarch.rpm"
RPM_HASH = "8cf4d527ed7c3731b0e5c14a4200cb163ece6c4651f34b15f24d973b5b71ea75c8bbb6e09b916ad9db07bd5c54d8eed2acb8eeae88f512008c0be918025c1c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-macholib \
python3.10dist(macholib) \
python310-macholib \
python3dist(macholib)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-altgraph \
python310-setuptools \
update-alternatives"

inherit rpm
