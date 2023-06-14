SUMMARY = "Development files for LV2"
DESCRIPTION = "LV2 is a plugin standard for audio systems, similar in scope to LADSPA, \
VST, AU, and others. It defines a C API for code and a format for data files \
which collectively describe a plugin. LV2 consists of a core (roughly \
equivalent in power to LADSPA) which can be extended to support more \
functionality. This allows the interface to be 'grown' to accommodate the needs \
of real software as they arise. \
 \
LV2 is both a stable interface and a forward-moving project: there is a stable \
set of 'official' extensions in use while new functionality is actively \
developed. Most functionality required by modern plugins is available, including: \
 \
  * Audio, control, 'control voltage' (audio-rate control), and event \
    (e.g. MIDI) input and output \
  * Expressive open-ended port metadata, including: \
    - 'Meaningful' controls (e.g. gain or envelope attack) allowing intelligent \
      host control or UI generation \
    - Control units (e.g. Hz, octaves, dB) \
    - Multi-channel port groups (e.g. stereo, 5.1 surround, ambisonics \
  * Embeddable GUIs in any toolkit, with support for a full plugin/UI split \
    (including network transparency in capable hosts) \
  * Ability to bundle any files (e.g. samples or impulses) with plugins \
  * Presets (bundled and/or user saved) \
  * Plugin state saving and restoring \
  * Host-managed logging \
  * Non-realtime plugin worker methods (simple and portable host-managed \
    threading) \
  * Message-based plugin communication, allowing plugins/UIs to have advanced \
    interfaces without host support or specifications getting in the way \
  * Transport awareness, both real time and tempo time (bars, beats, etc-.)"
LICENSE = "ISC"

PV = "1.18.10"

RPM_NAME = "lv2-devel-1.18.10-2.1.aarch64.rpm"
RPM_HASH = "86cb09e25cd6da1e47c26eda331efa19fad3f60a3fdc1906755bb3df63ffc0e5049c67f3a859afa4eb0b93e81dc8694ae382931190a145b4b07cf9df9462b520"

RPROVIDES:${PN} += "lv2-devel \
pkgconfig-lv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
lv2"

inherit rpm
