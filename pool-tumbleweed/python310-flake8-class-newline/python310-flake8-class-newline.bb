SUMMARY = "Flake8 lint for newline after class definitions"
DESCRIPTION = "Flake8 Extension to lint for a method newline after a Class definition"
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-flake8-class-newline-1.6.0-2.8.noarch.rpm"
RPM_HASH = "5a54cce07a5d362bd48a3b1cb6dfd7ba5a82ddc13cdcb0c0519a76c773332dc8e31076b873917fbf9f9a84484461f038dcf2ac57b5f014e89f9869e1f9d01558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-class-newline \
python3.10dist(flake8-class-newline) \
python310-flake8-class-newline \
python3dist(flake8-class-newline)"

RDEPENDS:${PN} += "python(abi) \
python310-flake8"

inherit rpm
