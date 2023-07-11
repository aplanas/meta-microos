SUMMARY = "A mock library for Python"
DESCRIPTION = "Minimock is a library for doing Mock objects with doctest. \
When using doctest, mock objects can be very simple."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-MiniMock-1.3.0-1.12.noarch.rpm"
RPM_HASH = "74540f47427ce4c7b207f7931f7c13a21de98f6d8f678e357bb4ceb51936ccc7f2183054b0b96273d7e9c5789c92840f93edaf5acad2ae41872a625033ef197b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MiniMock \
python3.11dist-minimock \
python311-MiniMock \
python3dist-minimock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
