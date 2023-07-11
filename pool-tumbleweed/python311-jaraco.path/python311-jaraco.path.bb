SUMMARY = "Miscellaneous path functions for jaraco packages"
DESCRIPTION = "jaraco.path provides cross platform hidden file detection \
and other miscellaneous path helper functions."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python311-jaraco.path-3.5.0-1.3.noarch.rpm"
RPM_HASH = "6326a37563c8da9a91734b0e883f86c85662c15b8b83125240e4dba2a50107556e7a9e0fcc9bf21a8fd3047bad14a4b536c4d0a51ef8a2350622f157c587a14e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.path \
python3.11dist-jaraco.path \
python311-jaraco.path \
python3dist-jaraco.path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
