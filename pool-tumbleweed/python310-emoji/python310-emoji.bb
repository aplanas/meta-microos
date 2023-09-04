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

RPM_NAME = "python310-emoji-2.8.0-1.1.noarch.rpm"
RPM_HASH = "189b149a6ae1eda57cbb2a56d430b377056e5d3efe39d512751425f32d3f0389a10e620a6fc58b11ede30b14c0123ac2a1a0571f207ca4674a2e7cb886324236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-emoji \
python310-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
