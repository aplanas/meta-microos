SUMMARY = "Perl bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "perl-Hamlib-4.5.5-2.1.aarch64.rpm"
RPM_HASH = "817eb76c9daea6166c582ca74f9b37af8bdc3686256f0b880f2b343230d40c8fc7dc96b17a7b68bed9196d2a3e0858960be8bad3d115b585185c94073867e090"

RPROVIDES:${PN} += "perl(Hamlib) \
perl(Hamlib::Amp) \
perl(Hamlib::Rig) \
perl(Hamlib::Rot) \
perl(Hamlib::cal_table) \
perl(Hamlib::cal_table_float) \
perl(Hamlib::cal_table_float_table) \
perl(Hamlib::cal_table_table) \
perl(Hamlib::chan_list) \
perl(Hamlib::channel) \
perl(Hamlib::channelArray) \
perl(Hamlib::channel_cap) \
perl(Hamlib::confparams) \
perl(Hamlib::confparams_u) \
perl(Hamlib::confparams_u_c) \
perl(Hamlib::confparams_u_n) \
perl(Hamlib::ext_list) \
perl(Hamlib::filter_list) \
perl(Hamlib::freq_range_t) \
perl(Hamlib::gran) \
perl(Hamlib::hamlib_port_deprecated_parm) \
perl(Hamlib::hamlib_port_deprecated_parm_cm108) \
perl(Hamlib::hamlib_port_deprecated_parm_gpio) \
perl(Hamlib::hamlib_port_deprecated_parm_parallel) \
perl(Hamlib::hamlib_port_deprecated_parm_serial) \
perl(Hamlib::hamlib_port_deprecated_parm_usb) \
perl(Hamlib::hamlib_port_deprecated_post_write_date) \
perl(Hamlib::hamlib_port_deprecated_type) \
perl(Hamlib::hamlib_port_parm) \
perl(Hamlib::hamlib_port_parm_cm108) \
perl(Hamlib::hamlib_port_parm_gpio) \
perl(Hamlib::hamlib_port_parm_parallel) \
perl(Hamlib::hamlib_port_parm_serial) \
perl(Hamlib::hamlib_port_parm_usb) \
perl(Hamlib::hamlib_port_post_write_date) \
perl(Hamlib::hamlib_port_t) \
perl(Hamlib::hamlib_port_t_deprecated) \
perl(Hamlib::hamlib_port_type) \
perl(Hamlib::rig_cache) \
perl(Hamlib::rig_callbacks) \
perl(Hamlib::rig_caps) \
perl(Hamlib::rig_spectrum_avg_mode) \
perl(Hamlib::rig_spectrum_line) \
perl(Hamlib::rig_spectrum_scope) \
perl(Hamlib::rig_state) \
perl(Hamlib::rot_caps) \
perl(Hamlib::rot_state) \
perl(Hamlib::s_rig) \
perl(Hamlib::s_rot) \
perl(Hamlib::toneArray) \
perl(Hamlib::tuning_step_list) \
perl(Hamlib::value_t) \
perl(Hamlib::value_t_b) \
perl(Hamlibc) \
perl-Hamlib \
perl-Hamlib(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhamlib.so.4()(64bit) \
perl-base"

inherit rpm