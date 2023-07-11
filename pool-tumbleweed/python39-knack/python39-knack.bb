SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python39-knack-0.10.1-1.5.noarch.rpm"
RPM_HASH = "7cb6e25eb647faa24ce25068c673ca6aa5f8d6c0f154259b2f9fb2852770c3a26fb157f5acc8c3608abafa32afe30107af270cc90f7e75624c9420d25f2f5d71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-knack \
python39-knack \
python3dist-knack"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-argcomplete \
python39-jmespath \
python39-pygments \
python39-tabulate"

inherit rpm
