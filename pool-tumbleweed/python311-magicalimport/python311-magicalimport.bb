SUMMARY = "Importing Python modules by physical file path"
DESCRIPTION = "Importing Python modules by physical file path."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python311-magicalimport-0.9.1-2.10.noarch.rpm"
RPM_HASH = "0cb51726ca04826d6534054c8e90e6c6172f15bad2e5f496bb9568a40ac66e5b6a75e72e370cb32bed44d29046b0fffc9fbaa1b4af692e152669c02fdc990166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magicalimport \
python3.11dist-magicalimport \
python311-magicalimport \
python3dist-magicalimport"

RDEPENDS:${PN} += "python-abi"

inherit rpm
