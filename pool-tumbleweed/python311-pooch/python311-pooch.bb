SUMMARY = "Manager for Python libraries' sample data files"
DESCRIPTION = "Pooch manages sample data files for Python libraries. It automatically \
downloads and stores them in a local directory, with support for versioning \
and checks for corruption."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python311-pooch-1.3.0-3.1.noarch.rpm"
RPM_HASH = "c5c5c7155371dac3763ea07390b068df8512bd2c42bbed2fb1ec4a7a40887b37046c86a2753022fb1fd5ca0dc0a7c873b0d5480f9ad25e4407d66742fee3cc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pooch \
python3.11dist-pooch \
python311-pooch \
python3dist-pooch"

RDEPENDS:${PN} += "python-abi \
python311-appdirs \
python311-packaging \
python311-requests"

inherit rpm
