SUMMARY = "Docs for oslo.metrics"
DESCRIPTION = "Documentation for the oslo.metrics library."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python-oslo.metrics-doc-0.6.0-1.3.noarch.rpm"
RPM_HASH = "5d7679848fe38ae2cb8e3b12e1a3feffbea64c564a668091b7ddc0d0e95c16e559a6cfdb4712fdd7ede4616e9a45cf572e62be4e8d11736dcffd69a145a5d726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.metrics-doc"

RDEPENDS:${PN} += ""

inherit rpm
