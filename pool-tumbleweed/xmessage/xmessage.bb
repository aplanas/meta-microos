SUMMARY = "Utility to display a message or query in a window"
DESCRIPTION = "xmessage displays a message or query in a window. The user can click \
on an 'okay' button to dismiss it or can select one of several buttons \
to answer a question. xmessage can also exit after a specified time."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xmessage-1.0.6-1.4.aarch64.rpm"
RPM_HASH = "38356ab0c2149769b9928c0f42957ebdc2f24ad6f1401f55279f576ed9ab163437ace436101d680f8ec2552a49f8fecc4470f667a8d8bb0b276f866350b07b6c"

RPROVIDES:${PN} += "xmessage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
