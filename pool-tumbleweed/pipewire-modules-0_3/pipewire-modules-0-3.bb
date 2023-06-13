SUMMARY = "Modules For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
The framework is used to build a modular daemon that can be configured to: \
 \
 * Be a low-latency audio server with features like pulseaudio and/or jack; \
 * A video capture server that can manage hardware video capture devices \
   and provide access to them; \
 * A central hub where video can be made available for other applications \
   such as the gnome-shell screencast API."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-modules-0_3-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "541b7f1fbef4104d5df2275e3da6e158ca2e40d01c638c6ff22c794f260e6a1a15d23a7a6831ba384c89028091618a15176105de868a09aee5458097ea125f92"

RPROVIDES:${PN} += "libpipewire-module-access.so()(64bit) \
libpipewire-module-adapter.so()(64bit) \
libpipewire-module-avb.so()(64bit) \
libpipewire-module-client-device.so()(64bit) \
libpipewire-module-client-node.so()(64bit) \
libpipewire-module-combine-stream.so()(64bit) \
libpipewire-module-echo-cancel.so()(64bit) \
libpipewire-module-fallback-sink.so()(64bit) \
libpipewire-module-filter-chain.so()(64bit) \
libpipewire-module-jack-tunnel.so()(64bit) \
libpipewire-module-jackdbus-detect.so()(64bit) \
libpipewire-module-link-factory.so()(64bit) \
libpipewire-module-loopback.so()(64bit) \
libpipewire-module-metadata.so()(64bit) \
libpipewire-module-pipe-tunnel.so()(64bit) \
libpipewire-module-portal.so()(64bit) \
libpipewire-module-profiler.so()(64bit) \
libpipewire-module-protocol-native.so()(64bit) \
libpipewire-module-protocol-pulse.so()(64bit) \
libpipewire-module-protocol-simple.so()(64bit) \
libpipewire-module-pulse-tunnel.so()(64bit) \
libpipewire-module-raop-discover.so()(64bit) \
libpipewire-module-raop-sink.so()(64bit) \
libpipewire-module-rt.so()(64bit) \
libpipewire-module-rtkit.so()(64bit) \
libpipewire-module-rtp-sap.so()(64bit) \
libpipewire-module-rtp-session.so()(64bit) \
libpipewire-module-rtp-sink.so()(64bit) \
libpipewire-module-rtp-source.so()(64bit) \
libpipewire-module-session-manager.so()(64bit) \
libpipewire-module-spa-device-factory.so()(64bit) \
libpipewire-module-spa-device.so()(64bit) \
libpipewire-module-spa-node-factory.so()(64bit) \
libpipewire-module-spa-node.so()(64bit) \
libpipewire-module-zeroconf-discover.so()(64bit) \
libpw-v4l2.so()(64bit) \
pipewire-modules \
pipewire-modules-0_3 \
pipewire-modules-0_3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liblilv-0.so.0()(64bit) \
libm.so.6()(64bit) \
libmysofa.so.1()(64bit) \
libopus.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsndfile.so.1()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
