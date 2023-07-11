SUMMARY = "ANSII Color formatting for output in terminal"
DESCRIPTION = "Available text colors: grey, red, green, yellow, blue, magenta, cyan, white. \
Available text highlights: on_grey, on_red, on_green, on_yellow, on_blue, on_magenta, on_cyan, on_white. \
Available attributes: bold, dark, underline, blink, reverse, concealed."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python311-termcolor-2.1.1-2.3.noarch.rpm"
RPM_HASH = "deaf73e4cb42fbec4908f4d7aafae4e000efbc03728d34a6da39464b004212e5607499d77a880bd87a5684b284f830eb9a9f5da316394ea9b87fdc1d259fc731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-termcolor \
python3.11dist-termcolor \
python311-termcolor \
python3dist-termcolor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
