SUMMARY = "VOLK modtool"
DESCRIPTION = "This package provides volk_modtool, used for creating new \
VOLK kernels."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0.0"

RPM_NAME = "volk_modtool-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "9b9d7188a4fe7d3171e1632def77d1af903abd550ca47255cff7d0aad74dfa3943e23011409998a6ec0a3b09bdbbe8b352a7758966370b3aaadaea8301724354"

RPROVIDES:${PN} += "volk-modtool"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
