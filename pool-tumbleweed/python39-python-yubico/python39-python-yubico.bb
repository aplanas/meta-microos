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

RPM_NAME = "python39-python-yubico-1.3.3-2.8.noarch.rpm"
RPM_HASH = "724b2af6a6b19306d6cfcbb8f793d8b09b6348bcbea5110a7ee03b0aa4be981d4ffd3a2dd2ba35f56920a11fb3bb647a5a35a625247dd078b3d21ac3a14656ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-yubico \
python39-python-yubico \
python39-yubico \
python3dist-python-yubico"

RDEPENDS:${PN} += "python-abi \
python39-usb"

inherit rpm
