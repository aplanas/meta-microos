SUMMARY = "Build helpers for Asterisk sound packages"
DESCRIPTION = "This package contains additional RPM macros to help build Asterisk \
sound packages."
LICENSE = "SUSE-Public-Domain"

PV = "3"

RPM_NAME = "asterisk-sounds-devel-3-1.11.noarch.rpm"
RPM_HASH = "721d0ba20c3c207dd12d13e3e6a3995b0091ec7ead17323bcd0f7bbcd15be80ca36c68467961af73cdd9579e9c84a49eee45476c13c0e39cd57f96010c71be59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asterisk-sounds-devel \
rpm-macro-asterisk-collect-sndfiles \
rpm-macro-asterisk-lng-en \
rpm-macro-asterisk-lng-en-AU \
rpm-macro-asterisk-lng-en-GB \
rpm-macro-asterisk-lng-en-NZ \
rpm-macro-asterisk-lng-es \
rpm-macro-asterisk-lng-fr \
rpm-macro-asterisk-lng-it \
rpm-macro-asterisk-lng-ja \
rpm-macro-asterisk-lng-ru \
rpm-macro-asterisk-lng-sv \
rpm-macro-asterisk-snd-alaw \
rpm-macro-asterisk-snd-g722 \
rpm-macro-asterisk-snd-g729 \
rpm-macro-asterisk-snd-generic \
rpm-macro-asterisk-snd-gsm \
rpm-macro-asterisk-snd-siren14 \
rpm-macro-asterisk-snd-siren7 \
rpm-macro-asterisk-snd-sln16 \
rpm-macro-asterisk-snd-ulaw \
rpm-macro-asterisk-snd-wav \
rpm-macro-asterisk-sound-package \
rpm-macro-asterisk-sounds-dir"

RDEPENDS:${PN} += ""

inherit rpm
