SUMMARY = "Python Markdown parser with renderers and plugins"
DESCRIPTION = "A Python Markdown parser with renderers and plugins, \
compatible with sane CommonMark rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.5"

RPM_NAME = "python310-mistune-2.0.5-2.3.noarch.rpm"
RPM_HASH = "19ac967dd6af96451111e94229aa9caa680676195cf1e159dfb1cf5a48ecefa7da8972ae839622a4a91c7224eef96bfc2f312ab145f5350ac15a7cbef30a8670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mistune \
python310-mistune \
python3dist-mistune"

RDEPENDS:${PN} += "python-abi"

inherit rpm
