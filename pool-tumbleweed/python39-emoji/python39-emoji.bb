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

PV = "2.7.0"

RPM_NAME = "python39-emoji-2.7.0-1.1.noarch.rpm"
RPM_HASH = "afe612c984c644249d07188772aee05b312b3efe4a8a629deff59863d5b678f4343407e27ea2212cfebf0ec4ad3523f323f40ea8d3b7105a691e4683be8d1d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-emoji \
python39-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
