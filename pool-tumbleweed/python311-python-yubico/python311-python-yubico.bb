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

RPM_NAME = "python311-python-yubico-1.3.3-2.8.noarch.rpm"
RPM_HASH = "4bdfc33cd66a0b808579a412f71e3448abac395ac48fbe5a5bf3eb9268c938ddba15abf78628a9107e764fb1534f5a8205ae96fab06e19c55fae650cd3b9efa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-yubico) \
python311-python-yubico \
python311-yubico \
python3dist(python-yubico)"

RDEPENDS:${PN} += "python(abi) \
python311-usb"

inherit rpm
