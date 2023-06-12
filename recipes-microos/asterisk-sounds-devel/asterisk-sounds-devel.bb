SUMMARY = "Build helpers for Asterisk sound packages"
DESCRIPTION = "This package contains additional RPM macros to help build Asterisk \
sound packages."
LICENSE = "SUSE-Public-Domain"

PV = "3"

RPM_NAME = "asterisk-sounds-devel-3-1.11.noarch.rpm"
RPM_HASH = "721d0ba20c3c207dd12d13e3e6a3995b0091ec7ead17323bcd0f7bbcd15be80ca36c68467961af73cdd9579e9c84a49eee45476c13c0e39cd57f96010c71be59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asterisk-sounds-devel \
rpm_macro(asterisk_collect_sndfiles) \
rpm_macro(asterisk_lng_en) \
rpm_macro(asterisk_lng_en_AU) \
rpm_macro(asterisk_lng_en_GB) \
rpm_macro(asterisk_lng_en_NZ) \
rpm_macro(asterisk_lng_es) \
rpm_macro(asterisk_lng_fr) \
rpm_macro(asterisk_lng_it) \
rpm_macro(asterisk_lng_ja) \
rpm_macro(asterisk_lng_ru) \
rpm_macro(asterisk_lng_sv) \
rpm_macro(asterisk_snd_alaw) \
rpm_macro(asterisk_snd_g722) \
rpm_macro(asterisk_snd_g729) \
rpm_macro(asterisk_snd_generic) \
rpm_macro(asterisk_snd_gsm) \
rpm_macro(asterisk_snd_siren14) \
rpm_macro(asterisk_snd_siren7) \
rpm_macro(asterisk_snd_sln16) \
rpm_macro(asterisk_snd_ulaw) \
rpm_macro(asterisk_snd_wav) \
rpm_macro(asterisk_sound_package) \
rpm_macro(asterisk_sounds_dir)"
RDEPENDS:${PN} += ""

inherit rpm
