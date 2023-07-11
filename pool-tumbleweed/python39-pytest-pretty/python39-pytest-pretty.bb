SUMMARY = "Pytest plugin for printing summary data as I want it"
DESCRIPTION = "Opinionated pytest plugin to make output slightly easier to read \
and errors easy to find and fix."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-pytest-pretty-1.2.0-1.3.noarch.rpm"
RPM_HASH = "d626d4941caaa86d524342ebb795b521df4fccfc33c16ccd795a0ea7d083b50f3d209bacd7d26d5ce61245afdb91dc14abcf2f1e6acf1a536376947f13eefebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-pretty \
python39-pytest-pretty \
python3dist-pytest-pretty"

RDEPENDS:${PN} += "python-abi \
python39-pytest \
python39-rich"

inherit rpm
