SUMMARY = "Rancher CLI"
DESCRIPTION = "The Rancher Command Line Interface (CLI) is a unified tool for interacting with your Rancher Server. \
For usage information see: https://rancher.com/docs/rancher/v2.x/en/cli/"
LICENSE = "Apache-2.0"

PV = "2.7.0"

RPM_NAME = "rancher-cli-2.7.0-1.3.aarch64.rpm"
RPM_HASH = "7121f95aeb5ca25ff66fa2261027b64b7ddd962504ea835b32cfd3a2cec769a3244467dc8d38ebe5866c44d21ebe4f6b112732cafbff79738fa2ac0ea4bb9ef9"

RPROVIDES:${PN} += "rancher-cli \
rancher-cli(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
