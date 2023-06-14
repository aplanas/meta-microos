SUMMARY = "Plugins For PipeWire SPA"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
Some of its features include: \
 \
 * Unlimited input/output ports; \
 * Per port format enumeration and negotiation; \
 * Enumeration/configuration of per port parameters; \
 * Application controlled buffer allocation with option to let the plugin \
   Allocate memory; \
 * Arbitrary buffer metadata; \
 * Buffers are passed around by id which is very fast and avoids the need \
   for refcounting; \
 * Synchronous and asynchronous processing; \
 * All api is designed to work without any allocations; \
 * Arbirary input/output behaviour. \
 \
This package provides plugins for extending PipeWire SPA's functionality."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-spa-plugins-0_2-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "2bdf4ac7f2722b7366ad10e6ff6fb841bb2e8276b911b92512901900a9daafed8829182c8e496890ab17dd0c39c2e773381c98d1f3a17aa959f3f318e6811720"

RPROVIDES:${PN} += "libspa-aec-null.so \
libspa-aec-webrtc.so \
libspa-alsa.so \
libspa-audioconvert.so \
libspa-audiomixer.so \
libspa-audiotestsrc.so \
libspa-avb.so \
libspa-bluez5.so \
libspa-codec-bluez5-aac.so \
libspa-codec-bluez5-faststream.so \
libspa-codec-bluez5-lc3.so \
libspa-codec-bluez5-ldac.so \
libspa-codec-bluez5-opus.so \
libspa-codec-bluez5-sbc.so \
libspa-control.so \
libspa-dbus.so \
libspa-jack.so \
libspa-journal.so \
libspa-libcamera.so \
libspa-support.so \
libspa-test.so \
libspa-v4l2.so \
libspa-videoconvert.so \
libspa-videotestsrc.so \
libspa-vulkan.so \
pipewire-spa-plugins-0-2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libbluetooth.so.3 \
libc.so.6 \
libcamera-base.so.0.0.4 \
libcamera.so.0.0.4 \
libdbus-1.so.3 \
libfdk-aac.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjack.so.0 \
liblc3.so.1 \
libldacBT-abr.so.2 \
libldacBT-enc.so.2 \
libm.so.6 \
libopus.so.0 \
libsbc.so.1 \
libstdc++.so.6 \
libsystemd.so.0 \
libudev.so.1 \
libusb-1.0.so.0 \
libvulkan.so.1 \
libwebrtc-audio-processing.so.1"

inherit rpm
