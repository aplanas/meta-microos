SUMMARY = "Python code for talking to Yubico's YubiKeys"
DESCRIPTION = "The YubiKey is a hardware token for authentication. The main mode of the YubiKey \
is entering a one time password (or a strong static password) by acting as a USB HID device, \
but there are things one can do with bi-directional communication: \
 \
 1. Configuration. The yubikey_config class should be a feature-wise complete implementation \
    of everything that can be configured on YubiKeys version 1.3 to 3.x (besides deprecated \
    functions in YubiKey 1.x). See examples/configure_nist_test_key for an example. \
 2. Challenge-response. YubiKey 2.2 and later supports HMAC-SHA1 or Yubico challenge-response \
    operations. See examples/nist_challenge_response for an example."
LICENSE = "BSD-2-Clause"

PV = "1.3.3"

RPM_NAME = "python310-python-yubico-1.3.3-2.8.noarch.rpm"
RPM_HASH = "253f679ed28c13c3ebde4c591fedda3d6158e0c1c38293842d14a4be51949eff6f86de7a7acf805241bd0abec3b081bcaf0730ac98f4dda3f6bbf3e1ad780138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-yubico \
python3-yubico \
python3.10dist(python-yubico) \
python310-python-yubico \
python310-yubico \
python3dist(python-yubico)"

RDEPENDS:${PN} += "python(abi) \
python310-usb"

inherit rpm
