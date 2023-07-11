SUMMARY = "ANSII Color formatting for output in terminal"
DESCRIPTION = "Available text colors: grey, red, green, yellow, blue, magenta, cyan, white. \
Available text highlights: on_grey, on_red, on_green, on_yellow, on_blue, on_magenta, on_cyan, on_white. \
Available attributes: bold, dark, underline, blink, reverse, concealed."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python310-termcolor-2.1.1-2.3.noarch.rpm"
RPM_HASH = "c82db56e4ec62adc7c3a3ad10b04dc72bc22b294acf58778bcc03fceb304f71ca84568b75184eaac5644a36ee9d21157d85daa63e3944935c350486652a9ef6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-termcolor \
python310-termcolor \
python3dist-termcolor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
