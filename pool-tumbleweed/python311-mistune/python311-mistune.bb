SUMMARY = "Python Markdown parser with renderers and plugins"
DESCRIPTION = "A Python Markdown parser with renderers and plugins, \
compatible with sane CommonMark rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.5"

RPM_NAME = "python311-mistune-2.0.5-2.3.noarch.rpm"
RPM_HASH = "ef08ffcc274be6d9ea19e39ead004ce831884bc62eed53ea1f2a191ff7adb36518348c1b419357943debe4628c54ecb8074f3556c0813e24bb93271c7c88f9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mistune \
python3.11dist-mistune \
python311-mistune \
python3dist-mistune"

RDEPENDS:${PN} += "python-abi"

inherit rpm
