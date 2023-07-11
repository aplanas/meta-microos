SUMMARY = "Pretty console printing of tabular data"
DESCRIPTION = "Formatted console printing of tabular data. \
tableprint lets you easily print formatted tables of data. \
Unlike other modules, you can print single rows of data at a time \
(useful for printing ongoing computation results)."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-tableprint-0.9.1-3.5.noarch.rpm"
RPM_HASH = "066ae28748d476229b2bba9bf35a8e317b0b407883ebd449effca5165d199b762452f32347677f6fd3cb7103f070da3b7e3509120166cedc980a4ad310148563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tableprint \
python3.11dist-tableprint \
python311-tableprint \
python3dist-tableprint"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-wcwidth"

inherit rpm
