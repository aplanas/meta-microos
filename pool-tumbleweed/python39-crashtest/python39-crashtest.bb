SUMMARY = "Manage Python errors with ease"
DESCRIPTION = "A Python library that makes exceptions handling and inspection easier"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-crashtest-0.4.1-2.1.noarch.rpm"
RPM_HASH = "e155bfa0743ac6696d96e12195baf16707ee1fbcf7863c1687595c1d7bbae625796dfa20215e989ba45653a980be90c406bd1cdeda5932e4cc484874d085d639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(crashtest) \
python39-crashtest \
python3dist(crashtest)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
