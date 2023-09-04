SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.9_k6.4.11_1"

RPM_NAME = "lttng-modules-kmp-64kb-2.13.9_k6.4.11_1-1.14.aarch64.rpm"
RPM_HASH = "25d8cfb948ddf0dfaeac5b50c52bf35bd116e977c2a1d8d90e25d7b05a7865e548a69307517ccce9255644a9709f95d79ff4dd54db6188b770fc83e97c22caaf"

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
lttng-modules-kmp-64kb-k6.4.11-1 \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
