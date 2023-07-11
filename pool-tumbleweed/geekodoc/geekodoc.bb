SUMMARY = "DocBook based RNG Schema for SUSE Documentation"
DESCRIPTION = "GeekoDoc is a RELAX NG schema used for current SUSE documentation."
LICENSE = "GPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "geekodoc-2.2.2-12.1.noarch.rpm"
RPM_HASH = "f27d26b630b646aec12565abca99bf0b0b5f1f2a0299842e33ac019482e058b6124191b6d61d9dd2cd2c16a7cec4943221920b523a34ccbc9010052ef155c569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-geekodoc \
geekodoc"

RDEPENDS:${PN} += "/usr/bin/sh \
sgml-skel"

inherit rpm
