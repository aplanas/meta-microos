SUMMARY = "A bootstrapping and management tool for k0s clusters"
DESCRIPTION = "k0sctl is a bootstrapping and management tool for k0s clusters."
LICENSE = "Apache-2.0"

PV = "0.12.2"

RPM_NAME = "k0sctl-0.12.2-1.10.aarch64.rpm"
RPM_HASH = "9b564750c1f45a349d833900de6c0fdfc84a2641d8aacf1c598dfdf4c5df9f706325db38b4b38c5ae7005129bd79803dc047dff0ef499059735c518a0d94111e"

RPROVIDES:${PN} += "k0sctl"

RDEPENDS:${PN} += ""

inherit rpm
