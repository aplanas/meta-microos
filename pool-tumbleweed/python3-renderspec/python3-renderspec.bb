SUMMARY = "Generate spec files from Jinja2 templates"
DESCRIPTION = "renderspec is a tool to convert a .spec.j2 Jinja2 template to \
a rpm .spec file which is usable for different distributions \
and follow their policies and processes."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python3-renderspec-2.2.0-3.1.noarch.rpm"
RPM_HASH = "9102238ff4f50c014f582dadeb69d5cb4b8489916cda2cc638a0a4528ae471eb3cf47719f1924446300629cccb63061ce5789f77eb39e56e751df5e569b70fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-renderspec \
python3.11dist-renderspec \
python3dist-renderspec"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Jinja2 \
python3-PyYAML \
python3-packaging \
python3-pymod2pkg"

inherit rpm
