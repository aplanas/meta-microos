SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.9_k6.4.2_1"

RPM_NAME = "lttng-modules-kmp-64kb-2.13.9_k6.4.2_1-1.8.aarch64.rpm"
RPM_HASH = "f002e1a7b4475c87b5dcaca1eab338d8396ed7119281888dcfd40916ae82c576d398a1cd9ddd4a3dda0fa01298b5a25321df356a6c5625be6879590cf2840a38"

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
lttng-modules-kmp-64kb \
lttng-modules-kmp-64kb-k6.4.2-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
