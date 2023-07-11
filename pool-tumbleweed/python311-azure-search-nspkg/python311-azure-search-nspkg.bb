SUMMARY = "Microsoft Azure Search Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Search namespace package. It isn't intended to be \
installed directly. Search client libraries are located elsewhere: \
 \
* azure-search-documents \
 \
This package is for Python 2 only. It provides the necessary files for other packages \
to extend the azure namespace. Python 3.x libraries use PEP420 instead."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-search-nspkg-1.0.0-3.10.noarch.rpm"
RPM_HASH = "cb189c6facccc8b08afa5bbeefd7a4bc79e1b6e48013276abc398df68fe3a48f797afb909f8264e3550589551ed0b33353169960d62a8540551fe86003daa4f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-search-nspkg \
python3.11dist-azure-search-nspkg \
python311-azure-search-nspkg \
python3dist-azure-search-nspkg"

RDEPENDS:${PN} += "python311-azure-nspkg"

inherit rpm
