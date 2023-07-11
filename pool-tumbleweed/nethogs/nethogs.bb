SUMMARY = "Network Bandwidth Usage Monitor"
DESCRIPTION = "NetHogs is a small 'net top' tool. Instead of breaking the traffic down per \
protocol or per subnet, like most tools do, it groups bandwidth by process. \
NetHogs does not rely on a special kernel module to be loaded. If there's \
suddenly a lot of network traffic, you can fire up NetHogs and immediately see \
which PID is causing this. This makes it easy to indentify programs that have \
gone wild and are suddenly taking up your bandwidth."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.7"

RPM_NAME = "nethogs-0.8.7-1.7.aarch64.rpm"
RPM_HASH = "68188a0d4edbe4de2d12395b6974cfa864466045bafa178a82f4ccea8f64680816aa6562f5a8a6dc4da696e688ed8dc41998bad384299781b58ba69375efce2e"

RPROVIDES:${PN} += "nethogs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncurses.so.6 \
libpcap.so.1 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
