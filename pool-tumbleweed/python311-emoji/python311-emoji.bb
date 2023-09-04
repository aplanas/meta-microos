SUMMARY = "Emoji for Python"
DESCRIPTION = "This Python module provides unicode emoji output for strings containing emoji codes. \
In addition to the official list defined by the unicode consortium a whole bunch of aliases is defined. \
 \
Example: \
>> import emoji \
>> print(emoji.emojize('Python is :thumbs_up:')) \
Python is 👍 \
>> print(emoji.emojize('Python is :thumbsup:', use_aliases=True)) \
Python is 👍 \
 \
By default, the language is English (``language='en'``). Further supported langauges are: \
* Spanish ('es') \
* Portuguese ('pt') \
* Italian ('it') \
* French ('fr') \
* German ('de') \
* Farsi/Persian ('fa') \
* Indonesian ('id') \
* Simplified Chinese ('zh') \
* Japanese ('ja') \
* Korean ('ko')"
LICENSE = "BSD-3-Clause"

PV = "2.8.0"

RPM_NAME = "python311-emoji-2.8.0-1.1.noarch.rpm"
RPM_HASH = "0835916b4fe39ee6f1af6b905a04279be41d672454c986cab3cfe6e853d945c6e28cd7b89ea50aec8e3e16d6345bb7670f8b4d6631c89aef125fa369f0a4fd71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-emoji \
python3.11dist-emoji \
python311-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
