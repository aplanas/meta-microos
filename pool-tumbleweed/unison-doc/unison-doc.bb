SUMMARY = "File synchronization tool"
DESCRIPTION = "Graphical userinterface for Unison. \
 \
Unison is a file synchronization tool for Unix and Windows. It allows \
two replicas of a collection of files and directories to be stored on \
different hosts (or different disks on the same host), modified \
separately, then brought up to date by propagating the changes in each \
replica to the other."
LICENSE = "GPL-3.0+"

PV = "2.53.3"

RPM_NAME = "unison-doc-2.53.3-1.1.aarch64.rpm"
RPM_HASH = "eed9433d71462dcc54c076c72d24264d8f3782309c831ea2be6360843fa77bfada0465332586c99e280dce801dd11fb61f818ca00fec52668b10f8a7f0563f11"

RPROVIDES:${PN} += "unison-doc"

RDEPENDS:${PN} += ""

inherit rpm
