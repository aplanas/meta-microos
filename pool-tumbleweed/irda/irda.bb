SUMMARY = "Necessary Tools for Using the Infrared Port"
DESCRIPTION = "This package contains all necessary scripts and programs for setting up \
and using the infrared port for printing or communicating. The start \
and stop scripts are prepared to access the UART emulation ('SIR' mode) \
with 115 kbit/s data transfer rate. This is supported by most laptops \
with an infrared interface. \
 \
After starting the infrared protocol manager 'irmanger' with the \
command 'rcirda start', you can send data to your printer using the \
device file /dev/irlpt0. If you like to talk to other computers with \
infrared interface or to a mobile phone, you can use the serial \
emulation provided by the device file /dev/ircomm0. \
 \
Take a look at the README file located in \
/usr/share/doc/packages/irda/README and the IRDA HOWTO in \
/usr/share/doc/howto/en/IR-HOWTO.gz. If the infrared port on your \
laptop is located on an IO or IRQ address other than IO address 0x2f8 \
(/dev/ttyS1) or interrupt 3, you should use YaST to change the \
variables IRDA_PORT and IRDA_IRQ in the configuration file \
/etc/rc.config."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.18"

RPM_NAME = "irda-0.9.18-233.9.aarch64.rpm"
RPM_HASH = "da4ce52b43d852edf80aa535eb5d4dfe1e37cf9c41abf1deea0eaacab66dd080a651e3f0c46453104d8158324287dbfd924816eb87c7b7f75fd9ba5a7d4deeec"

RPROVIDES:${PN} += "irda"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libglib-2.0.so.0 \
systemd"

inherit rpm
