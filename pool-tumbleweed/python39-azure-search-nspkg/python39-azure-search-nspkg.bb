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

RPM_NAME = "python39-azure-search-nspkg-1.0.0-3.10.noarch.rpm"
RPM_HASH = "5335632f6043ca1cf27afa08aa4f012936b1b96a4f930ef9d3f9b5e7c04d49565a7fa2a67fcc50d940ddda0ef8e87396fe693ec3f7a0094f34dfaeb35efb6d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-search-nspkg \
python39-azure-search-nspkg \
python3dist-azure-search-nspkg"

RDEPENDS:${PN} += "python39-azure-nspkg"

inherit rpm
