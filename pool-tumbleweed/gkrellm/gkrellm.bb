SUMMARY = "Manages Multiple Stacked Monitors"
DESCRIPTION = "With a single process, GKrellM manages multiple stacked monitors and \
supports applying themes to match the monitors appearance to your \
window manager, Gtk, or any other theme. \
 \
* SMP CPU, Disk, Proc, and active net interface monitors with LEDs. \
 \
* Internet monitor that displays current and charts historical port \
   hits. \
 \
* Memory and swap space usage meters and a system uptime monitor. \
 \
* File system meters show capacity and free space and can mount and \
   umount. \
 \
* A mailbox monitor that can launch a mail reader and fetch remote \
   mail. \
 \
* Clock, calendar, and hostname display. \
 \
* APM laptop battery monitor. \
 \
* CPU and motherboard temperature display if lm_sensors modules are \
   installed. \
 \
* Multiple monitors managed by a single process to reduce system \
   load. \
 \
* PPP on and off button that can execute your PPP scripts. \
 \
* Charts are autoscaling with configurable grid line resolution. \
 \
* Separate colors for 'in' and 'out' data.  The in color is used for \
   CPU user time, disk read, forks, and net receive data.  The out \
   color is used for CPU sys time, disk write, load, and net \
   transmit data. \
 \
* A different theme can be created with the GIMP."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.11"

RPM_NAME = "gkrellm-2.3.11-2.11.aarch64.rpm"
RPM_HASH = "130c91a7f082cfbe433341d793526ec8253f2a27ba726bce285d31a4a6ab82d7d2f1bc3d3451ac0c2ce82945174d7c8c2228b606c8bdb50b7e88bf3fa467af50"

RPROVIDES:${PN} += "gkrellm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsensors.so.4 \
libssl.so.3"

inherit rpm
