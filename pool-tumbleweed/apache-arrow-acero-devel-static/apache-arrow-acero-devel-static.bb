SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the static library for the Acero streaming execution engine"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "13.0.0"

RPM_NAME = "apache-arrow-acero-devel-static-13.0.0-1.1.aarch64.rpm"
RPM_HASH = "564eec8025f24bb3c908ffeca2d5c131cbe779fe6954ae8454a787fafbc3cadcea5f4b383ff54a4b8a8d6a7952f4118c336a2c122b69281e7fca2dcb6601a427"

RPROVIDES:${PN} += "apache-arrow-acero-devel-static"

RDEPENDS:${PN} += "apache-arrow-devel"

inherit rpm
