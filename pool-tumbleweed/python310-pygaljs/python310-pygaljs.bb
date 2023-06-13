SUMMARY = "Python package providing assets pygaljs"
DESCRIPTION = "Python package providing assets from https://github.com/Kozea/pygal.js"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python310-pygaljs-1.0.2-2.1.noarch.rpm"
RPM_HASH = "523998c210aed29e487573b3f0ef01ca41c772597154c10fdb6e5c1858c3e07f7361cc3ec2bd6ebcde4dfd1e8f0dd31c1f914343146cd0564deb6c253c10ed82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygaljs \
python3.10dist(pygaljs) \
python310-pygaljs \
python3dist(pygaljs)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
