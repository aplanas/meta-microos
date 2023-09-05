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

PV = "0.3.79"

RPM_NAME = "pipewire-modules-0_3-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "773a424b3d7e910871d0630b774f38ed9675f0b91c92d4e04549abb8b4f8042db00c6829fd338c82ed09f183c5c2505748ca3ba8863900c7246158805e7db2c2"

RPROVIDES:${PN} += "libpipewire-module-access.so \
libpipewire-module-adapter.so \
libpipewire-module-avb.so \
libpipewire-module-client-device.so \
libpipewire-module-client-node.so \
libpipewire-module-combine-stream.so \
libpipewire-module-echo-cancel.so \
libpipewire-module-fallback-sink.so \
libpipewire-module-ffado-driver.so \
libpipewire-module-filter-chain-lv2.so \
libpipewire-module-filter-chain-sofa.so \
libpipewire-module-filter-chain.so \
libpipewire-module-jack-tunnel.so \
libpipewire-module-jackdbus-detect.so \
libpipewire-module-link-factory.so \
libpipewire-module-loopback.so \
libpipewire-module-metadata.so \
libpipewire-module-netjack2-driver.so \
libpipewire-module-netjack2-manager.so \
libpipewire-module-pipe-tunnel.so \
libpipewire-module-portal.so \
libpipewire-module-profiler.so \
libpipewire-module-protocol-native.so \
libpipewire-module-protocol-pulse.so \
libpipewire-module-protocol-simple.so \
libpipewire-module-pulse-tunnel.so \
libpipewire-module-raop-discover.so \
libpipewire-module-raop-sink.so \
libpipewire-module-rt.so \
libpipewire-module-rtkit.so \
libpipewire-module-rtp-sap.so \
libpipewire-module-rtp-session.so \
libpipewire-module-rtp-sink.so \
libpipewire-module-rtp-source.so \
libpipewire-module-session-manager.so \
libpipewire-module-spa-device-factory.so \
libpipewire-module-spa-device.so \
libpipewire-module-spa-node-factory.so \
libpipewire-module-spa-node.so \
libpipewire-module-vban-recv.so \
libpipewire-module-vban-send.so \
libpipewire-module-zeroconf-discover.so \
libpw-v4l2.so \
pipewire-modules \
pipewire-modules-0-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libffado.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblilv-0.so.0 \
libm.so.6 \
libmysofa.so.1 \
libopus.so.0 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libsndfile.so.1 \
libsystemd.so.0"

inherit rpm
