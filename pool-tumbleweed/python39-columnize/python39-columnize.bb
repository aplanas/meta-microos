SUMMARY = "Format a simple (i.e. not nested) list into aligned columns"
DESCRIPTION = "Format a simple (i.e. not nested) list into aligned columns."
LICENSE = "MIT"

PV = "0.3.11"

RPM_NAME = "python39-columnize-0.3.11-1.6.noarch.rpm"
RPM_HASH = "eed29704619f9d6ebcfcf75955bd3252ac5f2929ead36b38e26ab08cbddf71ba3aa72a6097f82b590645a48e98155bbc1dedfb47f6463be16c19fb68418bc207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-columnize \
python39-columnize \
python3dist-columnize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
