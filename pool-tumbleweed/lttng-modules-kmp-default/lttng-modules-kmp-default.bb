SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.9_k6.3.9_1"

RPM_NAME = "lttng-modules-kmp-default-2.13.9_k6.3.9_1-1.7.aarch64.rpm"
RPM_HASH = "4a0faab66f0c95812504c8003652e63e1518bf39c6920c239b4f33a30f1a5d95fa7cc576a019736e9300e2d79b1700033b70f619e91eb784c8f53e8e4e566ffe"

RPROVIDES:${PN} += "kmod-lttng-clock-plugin-test.ko \
kmod-lttng-clock.ko \
kmod-lttng-counter-client-percpu-32-modular.ko \
kmod-lttng-counter-client-percpu-64-modular.ko \
kmod-lttng-counter.ko \
kmod-lttng-kprobes.ko \
kmod-lttng-kretprobes.ko \
kmod-lttng-lib-ring-buffer.ko \
kmod-lttng-probe-9p.ko \
kmod-lttng-probe-asoc.ko \
kmod-lttng-probe-block.ko \
kmod-lttng-probe-gpio.ko \
kmod-lttng-probe-i2c.ko \
kmod-lttng-probe-irq.ko \
kmod-lttng-probe-jbd2.ko \
kmod-lttng-probe-kvm.ko \
kmod-lttng-probe-module.ko \
kmod-lttng-probe-napi.ko \
kmod-lttng-probe-net.ko \
kmod-lttng-probe-power.ko \
kmod-lttng-probe-printk.ko \
kmod-lttng-probe-rcu.ko \
kmod-lttng-probe-regulator.ko \
kmod-lttng-probe-sched.ko \
kmod-lttng-probe-scsi.ko \
kmod-lttng-probe-signal.ko \
kmod-lttng-probe-skb.ko \
kmod-lttng-probe-sock.ko \
kmod-lttng-probe-statedump.ko \
kmod-lttng-probe-sunrpc.ko \
kmod-lttng-probe-timer.ko \
kmod-lttng-probe-udp.ko \
kmod-lttng-probe-vmscan.ko \
kmod-lttng-probe-workqueue.ko \
kmod-lttng-probe-writeback.ko \
kmod-lttng-ring-buffer-client-discard.ko \
kmod-lttng-ring-buffer-client-mmap-discard.ko \
kmod-lttng-ring-buffer-client-mmap-overwrite.ko \
kmod-lttng-ring-buffer-client-overwrite.ko \
kmod-lttng-ring-buffer-event-notifier-client.ko \
kmod-lttng-ring-buffer-metadata-client.ko \
kmod-lttng-ring-buffer-metadata-mmap-client.ko \
kmod-lttng-statedump.ko \
kmod-lttng-test.ko \
kmod-lttng-tracer.ko \
kmod-lttng-uprobes.ko \
kmod-lttng-wrapper.ko \
lttng-modules-kmp \
lttng-modules-kmp-default \
lttng-modules-kmp-default-k6.3.9-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
