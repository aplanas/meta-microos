SUMMARY = "@public decorator for populating __all__"
DESCRIPTION = "public -- @public for populating __all__."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python39-atpublic-3.1.1-3.3.noarch.rpm"
RPM_HASH = "10c6c991845d6c7e115e9a20f305186ef61c4673ad9c4d210a2f4cf84f295dcae406d3f0d249edd51d1b8db64e4523a9aab88bf6e451888803b6063914e6b659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-atpublic \
python39-atpublic \
python3dist-atpublic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
