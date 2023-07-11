SUMMARY = "Hypothesis strategies for generating Python programs, something like CSmith"
DESCRIPTION = "Hypothesis strategies for generating Python programs, something like CSmith."
LICENSE = "MPL-2.0"

PV = "0.2.3"

RPM_NAME = "python311-hypothesmith-0.2.3-2.3.noarch.rpm"
RPM_HASH = "a751e5bf65da31cd610234d474189450bde4a0bfa01f03ebd1dc145b79dd4b741b51f5f4bcf2f0e8ddf21db22b29433bb5719ac1590ef53f91b99dea55489c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypothesmith \
python3.11dist-hypothesmith \
python311-hypothesmith \
python3dist-hypothesmith"

RDEPENDS:${PN} += "python-abi \
python311-base \
python311-hypothesis \
python311-lark \
python311-libcst"

inherit rpm
