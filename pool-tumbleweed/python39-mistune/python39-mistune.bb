SUMMARY = "Python Markdown parser with renderers and plugins"
DESCRIPTION = "A Python Markdown parser with renderers and plugins, \
compatible with sane CommonMark rules."
LICENSE = "BSD-3-Clause"

PV = "2.0.5"

RPM_NAME = "python39-mistune-2.0.5-2.3.noarch.rpm"
RPM_HASH = "af6a0d5d40decf181ce02e8ac020310e84ab007b8683aaf127c94a0cba410715d208f148a42bfb29fd5b7bbfc5bb0d04bc6c3ef413f385bfc982c4bc1d55e2f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mistune \
python39-mistune \
python3dist-mistune"

RDEPENDS:${PN} += "python-abi"

inherit rpm
