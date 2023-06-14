SUMMARY = "Implementation of SA Forum's Hardware Platform Interface (HPI)"
DESCRIPTION = "OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). HPI is an \
abstracted interface for managing computer hardware, typically for chassis and \
rack based servers. HPI includes a resource model; access to and control over \
sensor, control, watchdog, and inventory data associated with resources; \
abstracted System Event Log interfaces; hardware events and alerts; and a \
managed hotswap interface. \
 \
OpenHPI provides a modular mechanism for adding new hardware and device \
support. Plug-ins exist for providing access to various types of hardware, \
including IPMI-based servers, Blade Center, and machines that export data via \
sysfs."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-3.8.0.ge4631e8a-3.4.aarch64.rpm"
RPM_HASH = "4cd713275ab343e46d8d7ad3a89698d11992dec84c6939e73a89c8e02c0e4dab4e4ddce4bc371b4b5a9f35a63768c77050f03a3f74bbf4a30c8cae87a15037e3"

RPROVIDES:${PN} += "config-openhpi \
libdyn-simulator.so.4 \
libilo2-ribcl.so.4 \
libipmidirect.so.4 \
liboa-soap.so.4 \
libsimulator.so.4 \
libslave.so.4 \
libtest-agent.so.4 \
libwatchdog.so.4 \
openhpi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libopenhpiutils.so.4 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
